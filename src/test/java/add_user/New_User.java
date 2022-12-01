package add_user;

public class New_User {
	import org.assertj.core.api.Assertions;
	import org.testng.annotations.Test;

	import com.ttt.commonutils.PageNameContext;
	import com.ttt.enums.Context;
	import com.ttt.enums.PageName;
	import com.ttt.orangehrmpages.AdminPage;
	import com.ttt.orangehrmpages.CommonPage;
	import com.ttt.orangehrmpages.LoginPage;


	public final class OHRMTests extends BaseTest{
			
		private OHRMTests() {
			
		}


		@Test
		public void loginLogOut() {
			Assertions.assertThat(
					new LoginPage().login("Admin", "admin123")
					.logout().checkLoginTitle()
					).isTrue();	
		}

		@Test
		public void addUser() {
			new LoginPage().login("Admin", "admin123");
			((AdminPage)new CommonPage()
					 .navigateUsingLeftnavBar(PageName.ADMIN))
			         .deleteUser("iamrobot")
			         .clickAddUser()
			         .enterAndSaveEmployeeDetails("ESS", "Aaliyah Haq", "Enabled"
					                   , "iamrobot", "Robot_123");
		}



	}

}
