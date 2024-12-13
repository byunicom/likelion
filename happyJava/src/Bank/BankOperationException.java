package Bank;
//일반적인 은행 관련 오류 처리
//고객이나 계좌 등록 시 최대 개수를 초과하는 경우
public class BankOperationException extends RuntimeException {
    public BankOperationException(String message) {
        super(message);
    }
}
