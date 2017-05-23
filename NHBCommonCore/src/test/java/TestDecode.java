import com.nhb.common.data.PuArrayList;

public class TestDecode {

	public static void main(String[] args) {
		byte[] bytes = new byte[] { -36, 0, 21, 1, -80, 93, -122, -38, 99, 63, -44, 78, -18, -68, -93, -96, 44, 114,
				-103, -85, 9, -80, -115, -44, 114, -66, 81, -104, 68, -125, -82, -14, -45, 38, -15, 105, 127, -83, -51,
				3, -3, -38, 0, -44, 123, 34, 114, 101, 115, 117, 108, 116, 34, 58, 123, 34, 98, 111, 110, 117, 115, 86,
				97, 108, 117, 101, 34, 58, 52, 48, 48, 48, 125, 44, 34, 99, 97, 109, 112, 97, 105, 103, 110, 73, 100,
				34, 58, 34, 56, 97, 48, 49, 51, 55, 56, 55, 45, 99, 50, 98, 56, 45, 52, 57, 49, 51, 45, 98, 101, 102,
				50, 45, 99, 53, 50, 101, 101, 97, 48, 97, 53, 102, 56, 54, 34, 44, 34, 101, 118, 101, 110, 116, 67, 97,
				109, 112, 97, 105, 103, 110, 70, 108, 97, 116, 73, 100, 34, 58, 34, 100, 97, 102, 51, 100, 48, 98, 49,
				45, 52, 51, 55, 57, 45, 52, 97, 56, 52, 45, 57, 56, 54, 51, 45, 99, 51, 101, 57, 53, 102, 98, 50, 53,
				100, 48, 56, 34, 44, 34, 105, 115, 83, 97, 110, 100, 98, 111, 120, 34, 58, 102, 97, 108, 115, 101, 44,
				34, 99, 97, 109, 112, 97, 105, 103, 110, 78, 97, 109, 101, 34, 58, 34, 98, 111, 110, 117, 115, 32, 103,
				111, 108, 100, 32, 102, 111, 114, 32, 102, 105, 114, 115, 116, 32, 99, 97, 114, 100, 32, 99, 97, 115,
				104, 32, 105, 110, 34, 125, -64, -64, -64, -49, 0, 0, 1, 92, 53, 74, 94, -79, -80, -94, 97, 28, 84,
				-111, 126, 66, -64, -121, 21, -11, 3, -118, -76, -34, 7, -1, -64, -64, -64, -64, -64, -64, -1, -1, -1,
				-1 };

		System.out.println("Input data as String: " + new String(bytes));
		System.out.println("--> " + PuArrayList.fromObject(bytes));
	}

}
