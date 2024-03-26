import { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { itemActions } from "../store/Slice/itemsSlice";
import { fetchStatusActions as status } from "../store/Slice/fetchStatusSlice";

const FetchItem = () => {
  const fetchStatus = useSelector((store) => store.fetchStatus);
  const dispatch = useDispatch();

  useEffect(() => {
    if (fetchStatus.fetchDone) return;
    dispatch(status.markFetchingStarted());
    const controller = new AbortController();
    const signal = controller.signal;

    fetch("http://127.0.0.1:8081/items", { signal })
      .then((res) => res.json())
      .then((items) => {
        dispatch(status.markFetchDone());
        dispatch(status.markFetchingFinished());
        dispatch(itemActions.addInitialItems(items));
      });

    return () => {
      controller.abort();
    };
  }, [fetchStatus]);

  return <div></div>;
};

export default FetchItem;
