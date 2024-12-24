package Bank3;

import java.util.Timer;
import java.util.TimerTask;

class Account {
        public static int totalCount = 0;
        public int money = 0;
        public String id = null;
        public String pw = null;

        public Account() {
                totalCount++;
        }

        public Account(String id, String pw) {
                this();
                this.id = id;
                this.pw = pw;
        }

        public boolean isLogin(String id, String pw) {
                boolean retrunValue = false;
                if (this.id.equals(id) && this.pw.equals(pw)) {
                        retrunValue = true;
                }
                return retrunValue;
        }

        public void display() {
                System.out.println("--------------------");
                System.out.println("총 계정수:" + Account.totalCount);
                System.out.println("Id:" + id);
                System.out.println("Money:" + money);
                System.out.println("--------------------");
        }

        public void add(int money) {
                this.money = this.money + money;
        }

        public void minus(int money) {
                this.money = this.money - money;
        }

        public void menu() {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                String inputString = null;
                boolean falg = true;

                while (falg) {
                        System.out.println(" ");
                        System.out.println("'" + this.id + "' 고객님 환영합니다!");
                        System.out.println("1.입금 2.출금 3.종료");
                        inputString = sc.nextLine();

                        switch (inputString) {
                                case "1":
                                        System.out.println(" ");
                                        display();
                                        System.out.println("입금액을 입력하세요");
                                        int money = Integer.parseInt(sc.nextLine());
                                        add(money);
                                        System.out.println(" ");
                                        display();
                                        break;
                                case "2":
                                        System.out.println(" ");
                                        display();
                                        System.out.println("출금액을 입력하세요");
                                        money = Integer.parseInt(sc.nextLine());
                                        minus(money);
                                        System.out.println(" ");
                                        display();
                                        break;
                                case "3":
                                        System.out.println("사용을 종료하셨습니다");
                                        falg = false;
                                        break;
                                default:
                                        System.out.println("잘못된 입력입니다");
                        }
                }
        }
}

class Bank {
        public static int totalCount = 0;
        public String name = null;
        public Account[] account = new Account[5];
        public int accountCount = 0;
        public int accountCurrent = -1;

        public Bank() {
                totalCount++;
                start();
        }

        public void start(){
                Timer timer = new Timer();

                TimerTask timerTask = new TimerTask() {
                        @Override
                        public void run() {
                                menu();
                        }
                };

                System.out.println("'//////////////////////////////.");
                System.out.println("'/    Welcome Lion's Bank     /.");
                System.out.println("'//////////////////////////////.");
                System.out.println();
                System.out.println();

                timer.schedule(timerTask, 500);
        }

        public void accountAdd() {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("가입을 원하는 id를 입력하세요");
                String id = sc.nextLine();
                if (isId(id)) { // id 중복확인
                        System.out.println("중복된 아이디 입니다");
                        return;
                }
                System.out.println("가입을 원하는 pw를 입력하세요");
                String pw = sc.nextLine();
                account[accountCount++] = new Account(id, pw);
        }

        private boolean isId(String id) {
                boolean returnValue = false;
                for (int i = 0; i < accountCount; i++) {
                        if (account[i].id.equals(id)) {
                                returnValue = true;
                        }
                }
                return returnValue;
        }

        public void logout() {
                accountCurrent = -1;
                System.out.println("로그아웃 되었습니다");
        }

        public boolean login(String id, String pw) {
                boolean returnValue = false;
                for (int i = 0; i < accountCount; i++) {
                        if (account[i].isLogin(id, pw)) {
                                returnValue = true;
                                accountCurrent = i;
                                break;
                        }
                }
                return returnValue;
        }

        public void displayAll() {
                System.out.println("총 은행수:" + Bank.totalCount);
                System.out.println("현재 은행이름:" + name);
                for (int i = 0; i < accountCount; i++) {
                        account[i].display();
                }
        }

        public void useAccount() {
                if (accountCurrent != -1) {
                        account[accountCurrent].menu();
                } else {
                        System.out.println("잘못된 접근입니다");
                }
        }

        public void menu() {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                boolean flag = true;

                while (flag) {
//                        System.out.println("1.계정등록 2.모든 계정 출력 3.로그인 4.로그아웃 5.계정삭제 6.종료");

                        System.out.println("=== 라이온 은행 시스템 ===");
                        System.out.println("1.\t고객 등록");
                        System.out.println("2.\t계좌 생성");
                        System.out.println("3.\t입금");
                        System.out.println("4.\t출금");
                        System.out.println("5.\t잔액 조회");
                        System.out.println("6.\t종료");
                        System.out.println("========================");

                        System.out.println("메뉴 번호를 입력해주세요 > ");
                        String stringInput = sc.nextLine();
                        switch (stringInput) {
                                case "1":
                                        accountAdd();
                                        displayAll();
                                        break;
                                case "2":
                                        displayAll();
                                        break;
                                case "3":
                                        System.out.println(" ");
                                        System.out.println("어서오세요!");
                                        System.out.println("id를 입력하세요 ☞");
                                        String id = sc.nextLine();
                                        System.out.println("pw를 입력하세요 ☞");
                                        String pw = sc.nextLine();
                                        if (login(id, pw)) {
                                                System.out.println("로그인 되었습니다");
                                                useAccount();
                                        } else {
                                                System.out.println("아이디 또는 비밀번호를 정확히 입력하세요");
                                        }
                                        break;
                                case "4":
                                        logout();
                                        break;
                                case "5":
                                        if (accountCurrent != -1) {
                                                System.out.println(" ");
                                                System.out.println("pw를 입력하세요");
                                                pw = sc.nextLine();
                                                delect(pw);
                                        } else {
                                                System.out.println("로그인 하세요");
                                        }
                                        break;
                                case "6":
                                        System.out.println("이용해주셔서 감사합니다");
                                        flag = false;
                                        break;
                                default:
                                        System.out.println("잘못된 입력입니다");
                        }
                }
        }

        public void delect(String pw) {
                delect(account[accountCurrent].id, pw);
        }

        public void delect(String id, String pw) {
                boolean flag = false;
                for (int i = 0; i < accountCount; i++) {
                        if (account[i].isLogin(id, pw)) {
                                accountCurrent = i;
                                flag = true;
                                break;
                        }
                }
                if (flag = true) {
                        for (int i = accountCurrent; i + 1 < accountCount; i++) {
                                account[i] = account[i + 1];
                        }
                        Account.totalCount--;
                        accountCount--;
                        accountCurrent = -1;
                        System.out.println("삭제되었습니다");
                } else {
                        System.out.println("삭제에 실패했습니다");
                }
        }
}

public class BankPr {
        public static void main(String[] args) {
                Bank bk = new Bank();
        }
}
