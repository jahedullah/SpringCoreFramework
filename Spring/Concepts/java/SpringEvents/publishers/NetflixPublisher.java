package SpringEvents.publishers;

import SpringEvents.listeners.RobinListener;
import SpringEvents.listeners.TomListener;
import SpringEvents.listeners.WillyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// See the problem here. Everytime you add a new listener you have to manually hard code it to notify them.
// Now to get rid of these Autowired dependencies we will work in a NetflixPublisherUpdated Class
@Component
public class NetflixPublisher {
    @Autowired
    private WillyListener willyListener;
    @Autowired
    private TomListener tomListener;
    @Autowired
    private RobinListener robinListener;
    public void streamGameOfThrones(String episode){
        System.out.println("Streaming Game of Thrones : Episode " + episode);
        willyListener.listeningGot(episode);
        tomListener.listeningGot(episode);
        robinListener.listeningGot(episode);
    }
}
