package chapter08;

public class VIPCustomer extends Customer{             //237 ∆‰¿Ã¡ˆ
	private int agentID;
	double saleRatio;

	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;

	}

//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int) (price * saleRatio);
//	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
