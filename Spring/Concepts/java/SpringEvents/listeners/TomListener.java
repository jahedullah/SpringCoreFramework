package SpringEvents.listeners;

import SpringEvents.shows.TheGameOfThrones;
import org.springframework.stereotype.Component;
import org.springframework.context.event.EventListener;


@Component
public class TomListener{
    public void listeningGot(String episode){
        System.out.println("Tom watching GOT : Episode " + episode);
    }

    @EventListener
    public void onApplicationEvent(TheGameOfThrones theGameOfThrones) {
        listeningGot(theGameOfThrones.getEpisodeNo());

    }
}
