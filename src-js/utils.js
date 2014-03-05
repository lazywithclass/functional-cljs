function existy(x) {
  // using the loose inequality operator is possible to distinguish from
  // null, undefined, and everything else
  return x != null;
};

function truthy(x) {
  return x !== false && existy(x);
};

function doWhen(cond, action) {
  if (truthy(cond)) {
    return action();
  }
  return undefined;
}


module.exports.existy = existy;
module.exports.truthy = truthy;
module.exports.doWhen = doWhen;
