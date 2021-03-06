package org.osforce.connect.service.commons;

import java.util.List;

import org.osforce.connect.entity.commons.Template;
import org.osforce.spring4me.dao.Page;

/**
 * 
 * @author gavin
 * @since 1.0.0
 * @create Feb 13, 2011 - 10:15:42 AM
 *  <a href="http://www.opensourceforce.org">开源力量</a>
 */
public interface TemplateService {

	Template getTemplate(Long templateId);
	
	Template getTemplate(Long categoryId, String templateCode);
	
	void createTemplate(Template template);
	
	void updateTemplate(Template template);
	
	void deleteTemplate(Long templateId);

	Page<Template> getTemplatePage(Page<Template> page, Long siteId);

	List<Template> getTemplateList(Long siteId);

}
