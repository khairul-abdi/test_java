public class Main
{
	public static void main(String[] args) {
		String strSaldo = "1,000,000.00";
		String strTemp  = "Rp " + strSaldo.replace(",", "");
		strTemp         = strTemp.replace(".", ";");
		String[] newstrTemp         = strTemp.split(";");
		System.out.println(newstrTemp[0] + ".00");
	}
}
