package com.ratatyq.testgame.util;

import com.badlogic.gdx.math.Rectangle;

/**
 * Класс физики(внимание работает в 2D где камера повернута на 90c), на данный момент реализованы следующие функции:
 * 1) Функция позволяющая передвигать объекты
 * */

public class Physics {

    public Physics() {

    }

    public void moveObjectWitchPeople(Rectangle character, Rectangle object, byte speed) { // Если требуется передвижение объекта
        if(character.overlaps(object)) {
            if (character.overlaps(object)) {

                if (!(character.x > object.x + object.width - 10)) {

                    if (character.x + character.width > object.x + speed) {

                        if (character.y <= object.y) { // Двигает в низ
                            object.y += speed;
                        } else if (character.y <= object.y + object.height) { // Двигает в верх
                            object.y -= speed;
                        }

                    } else if (character.x + character.height > object.x - speed) { // Двигает в лево
                        object.x += speed;
                    }

                } else { // Двигает в право
                    object.x -= speed;
                }
            }
        }
    }
}
