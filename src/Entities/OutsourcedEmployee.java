package Entities;

public final class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hoursWorked, Double valueHour, Double additionalCharge) {
        super(name, hoursWorked, valueHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final double totalPayment() {
        return super.totalPayment() + additionalCharge * 1.1;
    }
}
