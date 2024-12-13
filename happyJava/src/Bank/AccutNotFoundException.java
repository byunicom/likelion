package Bank;
//존재하지 않는 계좌 요청 처리
//계좌 번호로 조회할 때 존재하지 않는 경우
public class AccutNotFoundException extends RuntimeException {
    public AccutNotFoundException(String message) {
        super(message);
    }
}
