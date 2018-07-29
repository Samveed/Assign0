import java.util.Random;

public class Infiltrator {
	int m=0;
	void findpath(Border b) {
			for(int i=0;i<3;i++) {
				if(b.s[m+1][i].d==0) {
					m++;
					break;
				};
			}
		}
}
