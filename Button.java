package com.ratatyq.testgame.util;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.ratatyq.testgame.MainScreen;

public class Button extends Actor {
    MainScreen game;

    private Texture texture;
    private float x,y;

    public Button(Texture texture, float x, float y) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        setBounds(this.x, this.y, texture.getWidth(), texture.getHeight());
    }

    @Override
    public void draw(Batch batch, float parentAlpha )
    {
        batch.draw(texture, x, y);
        super.draw(batch, parentAlpha);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
