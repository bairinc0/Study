public class HomeTheaterFacade{
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;
    public HomeTheaterFacade(Amplifier amp,Tuner tuner,Dvdplayer dvd,CdPlayer cd,Projector projector,TheaterLights lights,Screen screen, PopcornPopper popper ){
        this.amp=amp;
        this.tuner=tuner;
        this.dvd=dvd;
        this.cd=cd;
        this.projector=projector;
        this.lights=lights;
        this.screen=screen;
        this.popper=popper;
    }
    public void watchMovie(String movie){
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreeenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
    public void endMovie(){
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
    public static void main(String [] args){
        HomeTheaterFacade homeTheater=new HomeTheaterFacade(new Amplifier(),new Tuner(),new Dvdplayer(),new CdPlayer(),new Projector(),new TheaterLights(),new Screen(),new PopcornPopper());
        homeTheater.watchMovie("Die Hard");
        homeTheater.endMovie();
    }
}