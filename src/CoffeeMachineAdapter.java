
public class CoffeeMachineAdapter implements CoffeeMachineInterface{

	OldCoffeeMachine MyMachine;
	
	public CoffeeMachineAdapter(OldCoffeeMachine NewMachine){
	
		MyMachine = NewMachine;
		}
	public void ChooseFirstSelection(){
		
		MyMachine.SelectA();
		}
		public void ChooseSecondSelection(){
		
		MyMachine.SelectB();
		}
		@Override
		public void chooseFirstSelection() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void chooseSecondSelection() {
			// TODO Auto-generated method stub
			
		}
	}

