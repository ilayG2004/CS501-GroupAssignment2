Compose is declarative in that it implements a syntax that defines how the UI should look like for a given state, while Compose handles the complexities of how the layout is built, so that the developer doesn't have to worry about it

State is stored in the DemoScreen Composable, which is stateful, and the CustomText and CustomTextPreview Composables are stateless

This differs from XML logic in that you don't have to manually reupdate the UI and the state, and the Composables are functions of state, rather than a fixed layout, and you don't have a define a range of constraints that tell how each Composable is positioned and sized
