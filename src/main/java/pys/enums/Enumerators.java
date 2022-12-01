package pys.enums; 

public enum Enumerators {
	
	Login(new login()),
	Booknow(new booknow()),
	Proceed_to_pay(new ptp()),
	Offers(new offers()),
	Badminton(new badmntn()),
	Cricket(new crick()),
	Membership(new mem()),
	Consecutive(new consec()),
	Gym(new gym());
	
	
	private Command actions;
	
private enumerators() {
	

}
private enumerators(Command obj) {
	this.actions=obj;
}
public enumerators getactions() {
	return actions;
}
