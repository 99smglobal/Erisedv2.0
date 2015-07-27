package in.erised.android.erised;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.maps.model.LatLngBounds;

/**
 * Created by Akshay on 26/07/15.
 */
public class Place implements GeoDataApi {

    @Override
    public PendingResult<PlaceBuffer> addPlace(GoogleApiClient googleApiClient, AddPlaceRequest addPlaceRequest) {
        return null;
    }

    @Override
    public PendingResult<PlaceBuffer> getPlaceById(GoogleApiClient googleApiClient, String... strings) {
        return null;
    }

    @Override
    public PendingResult<AutocompletePredictionBuffer> getAutocompletePredictions(GoogleApiClient googleApiClient, String s, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        return null;
    }
}
