package src;
import com.eos.system.utility.CryptoUtil;



public class Test {
	
	
	private final static String ENCRYPT_KEY = "cap_user";
	
//	public static void main(String[] args) {
//		for( int i = 0; i <= 30 ; i ++){
//			StringBuilder str=new StringBuilder();//����䳤�ַ�
//			Random random  = new Random();
//			for(int j=0;j<8;j++){
//				str.append(random.nextInt(10));
//			}
//			//���ַ�ת��Ϊ���ֲ����
//			int num=Integer.parseInt(str.toString());
//			System.out.println(num);
//		}
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sdf.parse("2015-12-12");
//		System.out.println(date);
		
//		System.out.println(CryptoUtil.encrypt("000000", ENCRYPT_KEY));
		
		
//	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(CryptoUtil.encrypt("000000", ENCRYPT_KEY));
		
		
		System.out.println(CryptoUtil.decrypt("k2xvHUmCHWw=", ENCRYPT_KEY));
	}

}
