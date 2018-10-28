import java.io.BufferedReader;
import java.io.InputStreamReader;

public class digit {
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int inputNum=Integer.parseInt(br.readLine());
    //convert into string then every char back to its integer form
    int[]digits=Integer.toString(inputNum).chars().map(a->a-'0').toArray();
}

