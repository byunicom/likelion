package Bank;
//잘못된 입출금 요청 처리
//입출금 금액이 0 이하이거나 잔액이 부족한 경우
public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
