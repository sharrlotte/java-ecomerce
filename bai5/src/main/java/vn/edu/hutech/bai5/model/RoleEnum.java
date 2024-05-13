package vn.edu.hutech.bai5.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RoleEnum {
    ADMIN(1),
    USER(2);

    public final long value;
}
