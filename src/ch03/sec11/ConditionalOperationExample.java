package ch03.sec11;

import com.sun.source.util.DocTreeScanner;
import org.w3c.dom.ls.LSOutput;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 95;
        char garde = score > 90 ? 'A'
                : score > 80 ? 'B'
                : 'C';

        char greade2;
        if (score > 90) {
            greade2 = 'A';
        } else {
            if (score > 80) {
                greade2 = 'B';
            } else {
                greade2 = 'C';
            }
        }

    }

    }
