package project.model;

import java.util.ArrayList;

import project.exceptions.PostException;

/**
 * This class represents the salesperson profile
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class Profile {

	private ArrayList<Post> postList = new ArrayList<Post>();
	private ArrayList<SalesPerson> friendList = new ArrayList<SalesPerson>();
	private ArrayList<SalesPerson> friendRequestList = new ArrayList<SalesPerson>();

	public Profile(ArrayList<Post> postList, ArrayList<SalesPerson> friendList,
			ArrayList<SalesPerson> friendRequestList) {
		super();
		this.postList = postList;
		this.friendList = friendList;
		this.friendRequestList = friendRequestList;
	}

	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}

	public ArrayList<SalesPerson> getFriendList() {
		return friendList;
	}

	public void setFriendList(ArrayList<SalesPerson> friendList) {
		this.friendList = friendList;
	}

	public ArrayList<SalesPerson> getFriendRequestList() {
		return friendRequestList;
	}

	public void setFriendRequestList(ArrayList<SalesPerson> friendRequestList) {
		this.friendRequestList = friendRequestList;
	}
	
	
	// CRUD POST
	
	/**
	 * CREATE POST
	 * @param newPost
	 * @return
	 */
	public String createPost(Post newPost) {
		
		String message = "";
		postList.add(newPost);
		message = "Post created";
		return message;
	}
	
	
	/**
	 * this method get a post by id
	 * @param id
	 * @return
	 * @throws PostException
	 */
	public Post getPost(String id ) throws PostException {
		Post  postFound = null;
		boolean flag = false;
		
		for (Post post : postList) {
			if(post!= null && !flag && post.getId().equals(id)) {
				postFound = post;
				flag  = true;
			}
		}
		if(postFound == null) {
			throw new PostException("post don�t exist"); 
		}
		return postFound;
		
	}
	
	/**
	 * this method update a post 
	 * @param newPost
	 * @return
	 * @throws PostException
	 */
	public String updatePost(Post newPost) throws PostException {
		
		String message = "";
		Post postFound = null;
		boolean flag = false;
		
		for (Post post : postList) {
			if (!flag  && post.getId().equals(newPost.getId())) {
				
				postFound = post;
				flag = true;
				postFound.setDescription(newPost.getDescription());
				postFound.setId(newPost.getId());
				postFound.setProduct(newPost.getProduct());
				
				message = "update is successfull"; 
			}
		}
		if(postFound == null) {
			throw new PostException("post don�t exist");
		}
		return message;
	}
	
	public String delatePost(String id) {
		Post postFound = null;
		String message= "";
		boolean flag = false;
		try {
			postFound = getPost(id);
			for (Post post : postList) {
				if (flag== false && post!= null && post== postFound) {
					post  = null;
					message = "deleted post";
					flag= true;
				}
			}
		} catch (PostException e) {
			message = e.getMessage();
		}
		return message;
	}

}
