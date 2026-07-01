package oop.theory.practice.finals.iv;

import java.io.IOException;
import java.sql.SQLException;

public class Errors {
    public static void main(String[] args) {
        try {
            // code that can generate error
            int chance = (int) (Math.random() * 10);

            // Checked exceptions must be thrown
            if (chance == 2) {
                throw new IOException();
            }
            else if (chance == 3) {
                throw new SQLException();
            }
            else if (chance == 4) {
                throw new ClassNotFoundException();
            }
            else {
                throw new Exception("message of the error");
            }

        }
        catch (NullPointerException e) {

        }
        catch (ArithmeticException e) {

        }
        catch (IllegalArgumentException e) {

        }
        catch (IllegalStateException e) {

        }
        catch (ArrayIndexOutOfBoundsException e) {

        }
        catch (StringIndexOutOfBoundsException e) {

        }
        catch (IOException e) {

        }
        catch (SQLException e) {

        }
        catch (ClassNotFoundException e) {

        }
        catch (Exception e) {

        }
    }
}
