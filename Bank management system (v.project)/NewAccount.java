import java.sql.ResultSet;

class NewAccountAdd{
                
		DataAccess da=new DataAccess();
		public NewAccountAdd(String name,String age,String gender,String pn,String pass ){
            final String n=name;
            final String a=age;
			final String g=gender;
			final String number=pn;
                        final String p=pass;
		try{
			String adb="insert into registration (Name,Age,Gender,Number,password) values ('"+n+"','"+a+"','"+g+"','"+number+"','"+p+"')";
            da.updateDB(adb);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        

		}
}