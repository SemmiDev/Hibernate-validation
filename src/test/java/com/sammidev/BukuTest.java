package com.sammidev;

import com.sam.Buku;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class BukuTest {
    private static Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }
    @Test
    public void testBuku() {
        Buku buku = new Buku(
                "12345", "Cara Yang Benar Memahami Wanita", "Sammi",
                "Enersia",2003,"10434");
        Set<ConstraintViolation<Buku>> validate = validator.validate(buku);

        for (ConstraintViolation<Buku> bukuConstraintViolation : validate) {
            System.out.println(bukuConstraintViolation.getMessage());
        }
        assertEquals(validate.size(),0);
    }
}