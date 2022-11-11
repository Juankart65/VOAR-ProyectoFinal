/**
 * This class belongs to the package project.model
 */
package co.edu.uniquindio.finalproject.model;

/**
 * This interface represents everything related to friend requests
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 */
public interface FriendRequest {

	/**
	 * This method send a friend request
	 */
	public void sendFriendRequest();

	/**
	 * This method delete a friend request
	 */
	public void deleteFriendRequuest();

	/**
	 * This method accept a friend request
	 */
	public void acceptFriendReuest();

	/**
	 * This method suggests a friend request
	 */
	public void suggestFriendRequest();
}
