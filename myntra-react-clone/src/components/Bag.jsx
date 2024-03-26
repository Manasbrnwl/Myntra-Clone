import BagItem from "./BagItem";
import BagSummary from "./BagSummary";
import { useSelector } from "react-redux";

const Bag = () => {
  const bagItems = useSelector((state) => state.bag);
  const Items = useSelector((state) => state.items);

  const finalItems = Items.filter((item) => {
    const itemIndex = bagItems.indexOf(item.id);
    return itemIndex >= 0;
  });

  return (
    <main>
      <div className="bag-page">
        <div className="bag-items-container">
          {finalItems.map((item) => (
            <BagItem key={item.id} item={item} />
          ))}
        </div>
        <div className="bag-summary">
          <BagSummary />
        </div>
      </div>
    </main>
  );
};

export default Bag;
