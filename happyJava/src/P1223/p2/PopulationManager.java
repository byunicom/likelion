package P1223.p2;

import java.util.*;

public class PopulationManager {
    //알맞게 구현해 주세요.

    private Map<String, Integer> map = new HashMap<>();

    static final int ADD_OR_UPDATE=1;
    static final int REMOVE=2;
    static final int DISPLAY=3;
    static final int DISPLAY_ALL=4;
    static final int EXIT=5;

    public PopulationManager(){    }

    public void addOrUpdateCity(String city, Integer population){
        map.put(city, population);
    }

    public void removeCity(String city){
        map.remove(city);
    }

    public void displayPopulation(String city){
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();

        while(iter.hasNext()){
            String key = iter.next();
            Integer val = map.get(key);

            if (key.equals(city)) {
                System.out.println(key + "::" + val);
                break;
            }
        }
    }

    public void displayAll(){
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();

        while(iter.hasNext()){
            String key = iter.next();
            Integer val = map.get(key);
            System.out.println(key+"::"+val);
        }
    }

    public static void main(String[] args) {
        PopulationManager manager = new PopulationManager();
        Scanner scanner = new Scanner(System.in);

        manager.addOrUpdateCity("서울", 10000000);
        manager.addOrUpdateCity("부산", 3500000);

        while (true) {
            System.out.println("명령을 입력하세요 (1: 추가/수정, 2: 삭제, 3: 조회, 4: 전체 조회, 5: 종료): ");
            int command = scanner.nextInt(); // 사용자가 명령을 숫자로 입력
            if (command == EXIT) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String city;
            switch (command) {
                case ADD_OR_UPDATE:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    System.out.print("인구를 입력하세요: ");
                    int population = scanner.nextInt();
                    manager.addOrUpdateCity(city, population);
                    break;
                case REMOVE:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.removeCity(city);
                    break;
                case DISPLAY:
                    System.out.print("도시 이름을 입력하세요: ");
                    city = scanner.next();
                    manager.displayPopulation(city);
                    break;
                case DISPLAY_ALL:
                    manager.displayAll();
                    break;
                default:
                    System.out.println("알 수 없는 명령입니다.");
            }
        }
        scanner.close();
    }
}
