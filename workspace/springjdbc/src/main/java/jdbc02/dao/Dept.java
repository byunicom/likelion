package jdbc02.dao;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dept {
    private Integer id;
    private String deptName;
    private String location;
}
