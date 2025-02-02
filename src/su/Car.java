package su;

import java.util.*;

	class RaceCar {
		int car;
		int game;
		private int position = 0;
		
	public void Carset(int set) {
		this.car = set;
	}
	
	public void CarInfo() { 
		System.out.println("자동차 대수는 총 "+this.car+"대 입니다.");
	}
	public void Gameset(int set2) {
		this.game = set2;
	}
	public void GameInfo() { 
		System.out.println("시도할 회수는 총 "+this.game+"회 입니다.");
	}
	public void Move() {
		Random random = new Random();
		int number = random.nextInt(10);
		
		if(number >= 4) {
			position++;
		}
	}
	public int PositionInfo() {
		return position;
	}
	
	}
	public class Car extends RaceCar {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차 대수는 몇 대인가요?");
		int carCount = sc.nextInt();
		System.out.println("시도할 회수는 몇 회인가요?");
		int gameCount = sc.nextInt();
		
		
		myCar.Carset(carCount);
		myCar.CarInfo();
		myCar.Gameset(gameCount);
		myCar.GameInfo();
		
		List<Car> cars = new ArrayList<>();
		for(int i = 0; i < carCount; i++) {
			cars.add(new Car());
		}
		
		for(int i = 0; i<gameCount; i++) {
			for(Car car : cars) {
				car.Move();
			}
		}
		
		for (int i = 0; i < cars.size(); i++) {
            System.out.println("자동차 " + (i + 1) + "의 현재 위치: " + cars.get(i).PositionInfo());
        }
		
		
		
		
		
	}
}


