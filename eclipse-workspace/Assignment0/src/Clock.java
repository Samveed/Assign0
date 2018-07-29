import java.util.Scanner;

public class Clock {
int time = 10;
Border b = new Border(4);
Infiltrator in = new Infiltrator();

void accept(int w,double p) {

//System.out.println(b.wid);
b.input(w,p);
//System.out.println(b.wid);
}

void simulate()
{
	while(in.m!=(b.wid-1))
	{
		b.update();
		in.findpath(b);
		time+=10;
	}
}
}
