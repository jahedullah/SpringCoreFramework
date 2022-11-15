package SpringEvents.listeners;

import SpringEvents.shows.TheGameOfThrones;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JahedListener{
    public void listeningGot(String episode){
        System.out.println("Jahed watching GOT : Episode " + episode);
    }
    @EventListener
    public void onApplicationEvent(TheGameOfThrones theGameOfThrones) {
        listeningGot(theGameOfThrones.getEpisodeNo());
    }
}
