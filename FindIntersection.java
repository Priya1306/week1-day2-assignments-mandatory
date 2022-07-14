package week1.day2.assignments.mandatory;

public class FindIntersection {

	public static void arrayintersection(int[] a,int[] b) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {2,3,8,5,6};
		int y[]= {6,7,8,3,9};
		arrayintersection(x, y);
	}

}
