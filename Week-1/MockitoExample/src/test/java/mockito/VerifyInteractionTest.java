package mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VerifyInteractionTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub method (optional but recommended)
        when(mockApi.getData()).thenReturn("Mock Data");

        // Create service
        MyService service = new MyService(mockApi);

        // Call method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();
    }
}