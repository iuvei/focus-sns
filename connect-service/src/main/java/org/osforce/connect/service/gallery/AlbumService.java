package org.osforce.connect.service.gallery;

import java.util.List;

import org.osforce.connect.entity.gallery.Album;
import org.osforce.spring4me.dao.Page;

/**
 * 
 * @author gavin
 * @since 1.0.0
 * @create Mar 24, 2011 - 11:34:14 AM
 *  <a href="http://www.opensourceforce.org">开源力量</a>
 */
public interface AlbumService {

	Album getAlbum(Long albumId);
	
	void createAlbum(Album album);
	
	void updateAlbum(Album album);
	
	void deleteAlbum(Long albumId);

	List<Album> getAlbumList(Long projectId);
	
	Page<Album> getAlbumPage(Page<Album> page, Long projectId);
}
