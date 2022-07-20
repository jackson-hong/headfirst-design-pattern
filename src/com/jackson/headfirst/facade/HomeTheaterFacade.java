package com.jackson.headfirst.facade;

public class HomeTheaterFacade {

    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             StreamingPlayer player,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        popcornPopper.on();
        popcornPopper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie(){
        popcornPopper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }
}
