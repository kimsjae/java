package ch05.miniProject;

public class ECar {
	private int km;
	private int battery;
	private boolean batteryEmptyNotified;
	
	private static ECar instance = new ECar();
	
	private ECar() {
		km = 0;
		battery = 100;
		batteryEmptyNotified = false;
	}
	
	public static ECar getInstance() {
		return instance;
	}

    public String dispDistance() {
        return "주행거리 " + km + "km";
    }

    public String dispBattery() {
        return "배터리 " + battery + "%";
    }
	
    public void drive() {
        if (battery > 0) {
            km++;
            battery -= 10;
            if (battery < 0) {
                battery = 0; // 배터리의 최소값을 0으로 유지
            }
        } else {
            if (!batteryEmptyNotified) { // 메시지가 아직 출력되지 않은 경우
                System.out.println("배터리 empty");
                batteryEmptyNotified = true; // 메시지를 출력했으므로 알림 상태를 업데이트
            }
        }
    }

	public static void main(String[] args) {
		ECar car = ECar.getInstance();
		for (int i = 0; i < Math.random() * 20; i++) {
            car.drive();
        }
		
		System.out.println(car.dispDistance());
		System.out.println(car.dispBattery());
	}

}
