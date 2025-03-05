import org.example.entity.SinhVien;
import org.example.service.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinhVienTest {
    private SinhVienService service;
    private SinhVien sv;

    @BeforeEach
    void setUp() {
        service = new SinhVienService();
        sv = new SinhVien("SV001", "Nguyen Van A", 20, 7.5f, 3, "CNTT");
    }

    @Test
    void findInvalidId(){
        sv= service.findSinhVienByCode("sv");
        assertNull(sv);
    }

    @Test
    void findEmptyId(){
        sv= service.findSinhVienByCode("");
        assertNull(sv);
    }
}
