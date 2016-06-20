/**
 * <p>This class contain the accounts of the persons with there id number and balance in there account.</p>
 * 
 * @author <h1>Assad Akram(Sp13-bse-008)</h1>
 *
 */
public abstract class Account {
int number;
float balance;
Person ps=new Person(null, number);
/**
 * <p>This method return the id number of the person having account.</p>
 * @return
 */
public int getNumber() {
	return number;
}
/**
 * <p>This method return the Balance of the person having account.</p>
 * @return
 */
public float getBalance() {
	return balance;
}
/**
 *<p> This method return the Object of the person having account.</p>
 * @return
 */
public Object getOwner(){
	return ps;
}
/**
 * <p>This method is use to deposit fund in the persons account.</p>
 * @param num
 */
public void deposit(int num){
	number=num;
}
/**
 * <p>This method is use to withdraw funds from the persons account.</p>
 * 
 * @param num
 * @return
 */
public boolean withdraw(int num){
	int a=num;
	return false;
}
}
