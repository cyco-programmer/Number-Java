/** tech no has evn no of digits. if the no is split in two equal halves, then the squares of these halves is equal to the no itself
 
 */
public class Tech_No
{
    int i,a,b,s;
    void display()
    {
        for(i=1000;i<=9999;i++)
        {
            a=i%100;
            b=i/100;
            s=a+b;
            if(s*s==i)
            {
                System.out.println(i);
            }
        }
    }
}
