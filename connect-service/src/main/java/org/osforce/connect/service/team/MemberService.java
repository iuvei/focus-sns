package org.osforce.connect.service.team;

import java.util.List;

import org.osforce.connect.entity.system.Project;
import org.osforce.connect.entity.system.User;
import org.osforce.connect.entity.team.TeamMember;
import org.osforce.spring4me.dao.Page;

/**
 *
 * @author gavin
 * @since 1.0.0
 * @create Feb 12, 2011 - 8:41:45 AM
 *  <a href="http://www.opensourceforce.org">开源力量</a>
 */
public interface MemberService {

	TeamMember getMember(Long memberId);
	
	TeamMember getMember(Project project, User user);

	TeamMember getMember(Project project, User user, Boolean enabled);

	void createMember(TeamMember member);

	void updateMember(TeamMember member);

	void deleteMember(Long memberId);

	Page<TeamMember> getMemberPage(Page<TeamMember> page, Project project);

	List<TeamMember> getMemberList(Project project, User user, String status, Boolean reverse);

	void requestMember(TeamMember member);

	void approveMember(Long memberId);

}
