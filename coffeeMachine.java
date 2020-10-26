CoffeeMachineInterface.Java

public interface CoffeeMachineInterface{

	public void chooseFirstSelection();
	public void chooseSecondSelection();
}

OldCoffeeMachine.Java

public class OldCoffeeMachine{
	
	public void SelectA(){
	
		System.out.println(" Selection A Chosen");
		
			}
	public void SelectB() {
		
		System.out.println(" Selection B Chosen");
			}

CoffeeMachineAdapter.Java

	public class CoffeeMachineAdapter implements CoffeeMachineInterface{
	
		OldCoffeeMachine MyMachine;
		
		public CoffeeMachineAdapter(oldCoffeeMachine NewMachine){
		
			MyMachine = NewMachine;
			}
		public void ChooseFirstSelection(){
			
			MyMachine.SelectA();
			}
			public void ChooseSecondSelection(){
			
			MyMachine.SelectB();
			}
		}
		
	}	



	 