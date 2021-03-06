package org.osforce.connect.service.system;

import java.util.List;

import org.osforce.connect.entity.system.Resource;
import org.osforce.spring4me.dao.Page;

/**
 * 
 * @author gavin
 * @since 1.0.0
 * @create Feb 25, 2011 - 11:02:24 AM
 *  <a href="http://www.opensourceforce.org">开源力量</a>
 */
public interface ResourceService {

	Resource getResource(Long resourceId);
	
	Resource getResource(String code);
	
	void createResource(Resource resource);
	
	void updateResource(Resource resource);
	
	void deleteResource(Long resourceId);

	Page<Resource> getResourcePage(Page<Resource> page);

	List<Resource> getResourceList();

	/** 
	 * intercept by @code SystemAspect
	 * @see ResourceSynchronizeTask
	 */
	void syncResources();

}
