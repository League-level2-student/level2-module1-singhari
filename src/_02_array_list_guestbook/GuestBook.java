package _02_array_list_guestbook;

import javax.swing.*;

public class GuestBook {
	public static void main(String[] args) {
		JFrame fra = new JFrame();
		JPanel pan = new JPanel();
		JButton namer =  new JButton("Add Name");
		JButton viewer = new JButton("View Names");
		pan.add(namer);
		pan.add(viewer);
		fra.add(pan);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
