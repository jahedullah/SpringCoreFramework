package SpringEvents.shows;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class TheGameOfThrones{
    private String episodeNo;
    public TheGameOfThrones(String episdeNo){
        this.episodeNo = episdeNo;
    }

    public String getEpisodeNo(){
        return episodeNo;
    }
}
