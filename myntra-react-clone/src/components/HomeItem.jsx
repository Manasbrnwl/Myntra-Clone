import { useDispatch, useSelector } from "react-redux";
import { bagActions } from "../store/Slice/bagSlice";
import { BiCartAdd } from "react-icons/bi";
import { MdOutlineRemoveShoppingCart } from "react-icons/md";

const HomeItem = ({ item }) => {
  const bagItems = useSelector((store) => store.bag);
  const dispatch = useDispatch();
  const elementFound = bagItems.indexOf(item.id) >= 0;

  const handleAddToBag = () => {
    dispatch(bagActions.addToBag(item.id));
  };

  const handleRemove = () => {
    dispatch(bagActions.removeFromBag(item.id));
  };

  return (
    <div className="item-container">
      <img className="item-image" src={item.image} alt="item image" />
      <div className="rating">
        {item.rating.stars} ⭐ | {item.rating.count}
      </div>
      <div className="company-name">{item.company}</div>
      <div className="item-name">{item.itemName}</div>
      <div className="price">
        <span className="current-price">Rs {item.currentPrice}</span>
        <span className="original-price">Rs {item.originalPrice}</span>
        <span className="discount">({item.discountPercentage}% OFF)</span>
      </div>
      {elementFound ? (
        <button
          type="button"
          className="btn btn-outline-dark btn-add-bag d-flex justify-content-center align-items-center"
          onClick={handleRemove}
        >
          <MdOutlineRemoveShoppingCart /> Remove
        </button>
      ) : (
        <button
          type="button"
          className="btn btn-success btn-add-bag d-flex justify-content-center align-items-center"
          onClick={handleAddToBag}
        >
          <BiCartAdd /> Add to Bag
        </button>
      )}
    </div>
  );
};

export default HomeItem;
