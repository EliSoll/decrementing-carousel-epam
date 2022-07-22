package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.array;

public class CarouselRun {
    Object carousel;
    int position = 0;

    public CarouselRun(Object carousel) {
        this.carousel = carousel;
    }

    public int next() {
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        return array[position++]--;
    }

    public boolean isFinished() {
        for (int var: array) {
            if (var > 0) return false;
        }
            return true;
        }
    }

