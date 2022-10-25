import java.util.*;

enum Type {
	PREMIUM, GOLD, SILVER, NONE;
}

class Customer {
	private String customerName;
	private String customerMobile;
	private Membership membership;
	private ArrayList<Service> as;

	Customer(String customerName, String customerMobile, Type ty) {
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.membership = new Membership(ty);
		this.as = new ArrayList<Service>();
	}

	public void addService(String serviceName, int serviceRate) {
		Service s = new Service(serviceName, serviceRate);
		as.add(s);
	}

	public int calculateTotalDiscount() {
		int totalDiscount = 0;
		for (Service service : as) {
			totalDiscount += this.membership.calculateDiscount(service);
		}
		return totalDiscount;
	}

	public int calculateTotalRate() {
		int totalRate = 0;
		for (Service service : as) {
			totalRate += service.getServiceRate();
		}
		return totalRate;
	}

	public void printBill() {
		System.out.println("*****BILL*****");
		System.out.println(this.customerName + "  " + this.customerMobile + "  " + this.membership.getType());
		int i = 1;
		for (Service service : as) {
			System.out.print(i + ". ");
			service.printDetails();
			i++;
		}
		System.out.println("Total: " + this.calculateTotalRate() + "-" + this.calculateTotalDiscount());
		System.out.println("Please Pay: " + (this.calculateTotalRate() - this.calculateTotalDiscount()));
		System.out.println("**********");
	}
}

class Service {
	private String serviceName;
	private int serviceRate;

	Service(String serviceName, int serviceRate) {
		this.serviceName = serviceName;
		this.serviceRate = serviceRate;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public int getServiceRate() {
		return this.serviceRate;
	}

	public void printDetails() {
		System.out.printf("%" + (-15) + "s", this.serviceName);
		System.out.print(this.serviceRate + "\n");
	}
}

class Membership {
	private Type ty;

	Membership(Type ty) {
		this.ty = ty;
	}

	public Type getType() {
		return this.ty;
	}

	public int calculateDiscount(Service s) {
		switch (this.ty) {
		case PREMIUM:
			return (int) (s.getServiceRate() * 0.2);
		case GOLD:
			return (int) (s.getServiceRate() * 0.15);
		case SILVER:
			return (int) (s.getServiceRate() * 0.1);
		default:
			return 0;
		}
	}
}

public class Q5 {

	public static void main(String[] args) {
		boolean flag = true;
		Customer c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Customer Details:");
		System.out.print("Name:");
		String n = scan.nextLine();
		System.out.print("Mobile:");
		String mo = scan.nextLine();
		System.out.print("Membership:");
		String mb = scan.nextLine();
		try {
			c = new Customer(n, mo, Type.valueOf(mb.toUpperCase()));
		} catch (Exception e) {
			c = new Customer(n, mo, Type.NONE);
		}
		System.out.println();
		while (flag) {
			System.out.print("Add Service(Y/N): ");
			char ch = scan.next().charAt(0);
			scan.nextLine();
			if (ch == 'Y' || ch == 'y') {
				System.out.print("ServiceName:");
				String sn = scan.nextLine();
				System.out.print("Rate:");
				String r = scan.nextLine();
				c.addService(sn, Integer.parseInt(r));
			} else {
				flag = false;
			}
		}
		c.printBill();
		scan.close();
	}

}
