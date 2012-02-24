package hms;

import hms.Views.LoginWindow;
import hms.models.User;

import hms.db.Database;

import javax.swing.SwingUtilities;

class HospitalManager
{
	public static void main(String[] args) {
		try {
			User new_user = new User("admin", "password");
			new_user.create();
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					LoginWindow lw = new LoginWindow();
					lw.setVisible(true);
				}
			});
			//Database.getInstance().closeConnection();
		} catch (Exception e) {
			
		}
	}
}