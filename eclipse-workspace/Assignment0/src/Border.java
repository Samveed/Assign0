import java.util.*;
public class Border {
	//Sensor t[]=new Sensor[4];
	int wid=100;
	Sensor s[][]= new Sensor[wid][3];
	double prob;
	
	int l=3;
	Border(int w){
		
	}
	void input(int w,double p ) {
		prob=p;
		wid=w;
		for(int i=0;i<wid;i++) {
			for(int j=0;j<l;j++) {
				s[i][j]=new Sensor();
			}
		}
		
	}
	void update() {
		for(int i=0;i<wid;i++) {
			for(int j=0;j<l;j++) {
				Random rand= new Random();
				int n = rand.nextInt(10)+1;
				if(n<=(prob*10)) {
					s[i][j].d=1;
				}
				else {
					s[i][j].d=0;
				}
			}
		}
		
	}
}
