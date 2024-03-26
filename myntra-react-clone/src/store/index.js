import { configureStore } from "@reduxjs/toolkit";
import itemSlice from "./Slice/itemsSlice";
import fetchStatusSlice from "./Slice/fetchStatusSlice";
import bagSlice from "./Slice/bagSlice";

const myntraStore = configureStore({
  reducer: {
    items: itemSlice.reducer,
    fetchStatus: fetchStatusSlice.reducer,
    bag: bagSlice.reducer,
  },
});

export default myntraStore;
